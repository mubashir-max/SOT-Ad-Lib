package com.manual.mediation.library.sotadlib.data

import com.google.android.gms.ads.interstitial.InterstitialAd
import com.mbridge.msdk.newinterstitial.out.MBNewInterstitialHandler

object InterstitialMaster {
    var interstitialAdMobHashMap: HashMap<String, InterstitialAd> = HashMap()
    var interstitialMintegralHashMap: HashMap<String, MBNewInterstitialHandler> = HashMap()
}