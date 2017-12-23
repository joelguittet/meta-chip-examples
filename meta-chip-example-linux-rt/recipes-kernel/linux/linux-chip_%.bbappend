# Customization of linux-chip

# Version (can be retrieved with uname -a)
LINUX_KERNEL_TYPE = "example-linux-rt"

# Files directory
FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

# Sources
SRC_URI_append = " \
    file://linux-rt.cfg \
    file://optimized.cfg \
    file://patch-4.4.30-rt41.patch \
"
