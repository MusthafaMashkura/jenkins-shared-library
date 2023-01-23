def playbook(String inventoryfile, String playbookfile){
  sh "ansible-playbook -i "${inventoryfile}" "${playbookfile}" --vault-password-file=/var/lib/jenkins/.vault_pass"
}
