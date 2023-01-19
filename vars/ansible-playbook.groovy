def playbook(String inventoryfile, String playbookfile) {
sh "ansible-playbook --vault-password-file=/var/lib/jenkins/.vault_pass -i $inventoryfile $playbookfile"
}
