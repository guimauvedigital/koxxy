package digital.guimauve.koxxy

import java.net.URI

data class Proxy(
    val url: URI,
    val username: String? = null,
    val password: String? = null,
)
