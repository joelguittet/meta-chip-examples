DESCRIPTION = "CHIP image I2C example, with I2C testing tools"
LICENSE = "MIT"

require recipes-core/images/chip-image-minimal.bb

IMAGE_INSTALL += " \
  i2c-tools \
"
