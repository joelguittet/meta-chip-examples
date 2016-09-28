DESCRIPTION = "CHIP image WiFi Hotspot example"
LICENSE = "MIT"

require recipes-core/images/chip-image-minimal.bb

IMAGE_INSTALL += " \
  chip-packagegroup-wifi-hotspot \
"
