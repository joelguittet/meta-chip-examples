DESCRIPTION = "CHIP image SPIDEV example, with SPI testing tool"
LICENSE = "MIT"

require recipes-core/images/chip-image-minimal.bb

IMAGE_INSTALL += " \
  spitools \
"
