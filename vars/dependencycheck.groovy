def dependency(String dp_check_name) {
  dependencyCheck additionalArguments: '--format HTML', odcInstallation: "$dp_check_name"
}
