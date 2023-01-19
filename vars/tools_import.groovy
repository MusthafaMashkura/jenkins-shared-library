def test(String maven_name, String jdk_name) {
  maven "${maven_name}",
  jdk "${jdk_name}"
}
