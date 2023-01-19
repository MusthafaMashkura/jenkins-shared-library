def test(String maven_name, String jdk_name) {
  tools { 
  maven "${maven_name}",
  jdk "${jdk_name}"
  }
}
