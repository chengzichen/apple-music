package com.stevesoltys.applemusic.framwork

import com.stevesoltys.applemusic.security.AppleMusicAuthToken

/**
 * @author：denghc(Ben)
 * @updateTime：2024/12/4 11:32
 * @description：DeveloperToken 苹果音乐开发者token提供者
 */
interface DevTokenProvider {
    var developerToken: AppleMusicAuthToken?
}
