workspace(name = "mockkbug")

load("@bazel_tools//tools/build_defs/repo:http.bzl", "http_archive")

##### Dependencies #####

http_archive(
    name = "io_bazel_rules_kotlin",
    sha256 = "da0e6e1543fcc79e93d4d93c3333378f3bd5d29e82c1bc2518de0dbe048e6598",
    urls = [
        "https://github.com/bazelbuild/rules_kotlin/releases/download/legacy-1.4.0-rc3/rules_kotlin_release.tgz",
    ],
)

http_archive(
    name = "rules_jvm_external",
    sha256 = "3d0e809a5a14cfe7e1071103e9e53528f2fa93e72b175fb43a8bdea74156382d",
    strip_prefix = "rules_jvm_external-0a7cc6a0b6764232a0ddd31ad87b489e1d47b166",
    url = "https://github.com/bazelbuild/rules_jvm_external/archive/0a7cc6a0b6764232a0ddd31ad87b489e1d47b166.tar.gz",
)

##### Setup #####

load("@rules_jvm_external//:defs.bzl", "maven_install")

maven_install(
    artifacts = [
        "io.mockk:mockk:1.10.0",
        "junit:junit:4.13-beta-1",
    ],
    fetch_sources = True,
    generate_compat_repositories = True,
    repositories = [
        "https://jcenter.bintray.com/",
        "https://maven.google.com",
        "https://repo1.maven.org/maven2",
    ],
)

load("@maven//:compat.bzl", "compat_repositories")

compat_repositories()

load("@io_bazel_rules_kotlin//kotlin:kotlin.bzl", "kotlin_repositories", "kt_register_toolchains")

kotlin_repositories()

kt_register_toolchains()


