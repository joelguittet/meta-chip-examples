DESCRIPTION = "CHIP image JAVA example, with OpenJdk7 and HelloWorld application"
LICENSE = "MIT"

require recipes-core/images/chip-image-minimal.bb

IMAGE_INSTALL += " \
  chip-packagegroup-java \
  helloworld \
"
