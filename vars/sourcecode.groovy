def git(String branch, String repourl) {
//  git branch: 'main', url: 'https://github.com/MusthafaMashkura/jenkins-cicd-ansible.git'
  git branch: ${branch}, url: ${repourl}
}
