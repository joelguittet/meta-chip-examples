DESCRIPTION = "CHIP image JAVA example, with OpenJdk7"
LICENSE = "MIT"

require recipes-core/images/chip-image-minimal.bb

PREFERRED_PROVIDER_virtual/java-initial = "cacao-initial"
PREFERRED_PROVIDER_virtual/java-native = "jamvm-native"
PREFERRED_PROVIDER_virtual/javac-native = "ecj-bootstrap-native"
PREFERRED_VERSION_openjdk-7-jre = "99b00-2.6.5"

IMAGE_INSTALL += " \
  openjdk-7-jre \
  helloworld \
"
