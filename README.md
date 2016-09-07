meta-chip-examples
==

NextThingCo C.H.I.P. Yocto meta layer examples.

This layer contains examples layers for the NextThingCo C.H.I.P. board.

This layer depends on the additional layers:
* meta-yocto
* meta-yocto-bsp
* meta-openembedded/meta-oe
* meta-openembedded/meta-python
* meta-openembedded/meta-networking
* meta-chip (from my GitHub https://github.com/myfreescalewebpage/meta-chip)


Layers
--

The following layers are available:
* meta-chip-example-1wire: usage of 1-Wire devices. Demonstrate how to easily patch the kernel with fragments and the device tree with patch files.
* meta-chip-example-spidev: usage of SPI interface. Second example to demonstrate how to patch the kernel with fragments and the device tree with patch files.

The wanted layer(s) are chosen in the bitbake layers configuration file.


Using
--

Clone sources:

	git clone https://github.com/myfreescalewebpage/meta-chip-examples.git ~/yocto/meta-chip-examples

See the README files of the example layers for details on the examples.

See also the README file of the meta-chip layer (from my GitHub https://github.com/myfreescalewebpage/meta-chip) to check details about building and flashing images on the C.H.I.P. board.


Contributing
--

All contributions are welcome :-)

Use Github Issues to report anomalies or to propose enhancements (labels are available to clearly identify what you are writing) and Pull Requests to submit modifications.


References
--

* https://github.com/myfreescalewebpage/meta-chip
