package digital.guimauve.koxxy.usecases

import digital.guimauve.koxxy.LocalProxyController
import digital.guimauve.koxxy.Proxy

class StartLocalProxyUseCase : IStartLocalProxyUseCase {

    override fun invoke(input1: Int, input2: Proxy) =
        LocalProxyController.startProxy(input1, input2)

}
