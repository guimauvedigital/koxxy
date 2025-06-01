# koxxy

**koxxy** is a lightweight SOCKS5 proxy server written in pure Kotlin. It allows you to create local SOCKS5 proxy
endpoints that forward traffic through a remote HTTPS proxy with optional authentication.

Ideal for Kotlin applications needing dynamic local proxies without relying on external binaries
like [Gost](https://github.com/go-gost/gost), especially on platforms like Windows.

## 📦 Installation

koxxy is published to Maven Central. Add the dependency to your `build.gradle.kts`:

```kotlin
dependencies {
    implementation("digital.guimauve.koxxy:core:0.1.0")
}
```

## 🚀 Features

* Start a local SOCKS5 proxy on any port
* Forward all traffic through a remote HTTPS proxy (with optional auth)
* Run multiple proxies in parallel
* Fully coroutine-based (non-blocking)
* Pure Kotlin (JVM)

## 🧪 Usage

### Start a Proxy

```kotlin
val startUseCase = StartLocalProxyUseCase()
startUseCase(1080, Proxy(URI("https://your-remote-proxy.com:443"), "yourUsername", "yourPassword"))
```

Now you can connect to: `socks5://localhost:1080`
Your traffic will go through the remote proxy with authentication.

### Stop a Proxy

```kotlin
val stopUseCase = StopLocalProxyUseCase()
stopUseCase(1080)
```
