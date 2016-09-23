DESCRIPTION = "CHIP image WiFi example, to connect to a WiFi WPA network"
LICENSE = "MIT"

require recipes-core/images/chip-image-minimal.bb

IMAGE_INSTALL += " \
  chip-packagegroup-wifi \
"
