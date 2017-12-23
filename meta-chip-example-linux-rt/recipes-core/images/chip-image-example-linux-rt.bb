DESCRIPTION = "CHIP image XENOMAI example"
LICENSE = "MIT"

require recipes-core/images/chip-image-minimal.bb

IMAGE_INSTALL += " \
  hwlatdetect \
  rt-tests \
"
