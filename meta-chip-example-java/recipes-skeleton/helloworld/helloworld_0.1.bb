SUMMARY = "JAVA HelloWorld example"
SECTION = "examples"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit java-library

RDEPENDS_${PN} = "openjdk-7-jre"

PR = "r0"

SRC_URI = " \
  file://HelloWorld.java \
  file://manifest \
"

S = "${WORKDIR}"

do_compile () {
  mkdir -p build
  javac -sourcepath . -d build `find . -name "*.java"`
  fastjar -C build -c -m manifest -f helloworld-${PV}.jar .
}

do_install_append () {
  install -d ${D}${ROOT_HOME}
  install -m 0644 ${WORKDIR}/helloworld-${PV}.jar ${D}${ROOT_HOME}/helloworld.jar
}

FILES_${PN} = " \
  ${ROOT_HOME}/helloworld.jar \
"
