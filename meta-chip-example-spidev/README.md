meta-chip-example-spidev
==

NextThingCo C.H.I.P. Yocto meta layer example SPIDEV.

This layer contains SPIDEV example for the NextThingCo C.H.I.P. board.

This layer depends on the additional layers:
* meta-yocto
* meta-yocto-bsp
* meta-openembedded/meta-oe
* meta-openembedded/meta-python
* meta-openembedded/meta-networking
* meta-chip (from my GitHub https://github.com/myfreescalewebpage/meta-chip)


Images
--

The following images are available:
* chip-image-example-spidev: image with spitools from https://github.com/cpb-/spi-tools to test SPI interface.

The wanted image is chosen during the build with bitbake command.


Using
--

Clone sources:

	git clone https://github.com/myfreescalewebpage/meta-chip-examples.git ~/yocto/meta-chip-examples

Add "meta-chip-examples/meta-chip-example-spidev" to the bitbake layers configuration file.

See the README file of the meta-chip layer (from my GitHub https://github.com/myfreescalewebpage/meta-chip) to check details about building and flashing images on the C.H.I.P. board.

### chip-image-example-spidev

See https://github.com/cpb-/spi-tools to check details and usage of spitools. The SPI interface on the C.H.I.P. board is "/dev/spidev2.0".


Contributing
--

All contributions are welcome :-)

Use Github Issues to report anomalies or to propose enhancements (labels are available to clearly identify what you are writing) and Pull Requests to submit modifications.


References
--

* https://github.com/myfreescalewebpage/meta-chip
* https://github.com/cpb-/spi-tools
