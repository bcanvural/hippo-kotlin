package org.example.components

import org.hippoecm.hst.core.component.HstRequest
import org.hippoecm.hst.core.component.HstResponse
import org.hippoecm.hst.core.parameters.ParametersInfo
import org.onehippo.cms7.essentials.components.EssentialsNewsComponent
import org.onehippo.cms7.essentials.components.info.EssentialsNewsComponentInfo

@ParametersInfo(type = EssentialsNewsComponentInfo::class)
class KotlinNewsComponent : EssentialsNewsComponent() {

    override fun doBeforeRender(request: HstRequest, response: HstResponse) {
        super.doBeforeRender(request, response)
    }

}