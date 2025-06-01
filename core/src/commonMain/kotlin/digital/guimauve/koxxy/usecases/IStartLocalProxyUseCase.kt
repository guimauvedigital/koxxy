package digital.guimauve.koxxy.usecases

import dev.kaccelero.usecases.IPairUseCase
import digital.guimauve.koxxy.Proxy

interface IStartLocalProxyUseCase : IPairUseCase<Int, Proxy, Unit>
