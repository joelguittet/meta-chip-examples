DESCRIPTION = "CHIP image C example, with HelloWorld application"
LICENSE = "MIT"

require recipes-core/images/chip-image-minimal.bb

IMAGE_INSTALL += " \
  helloworld \
"
