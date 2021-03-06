/*
 * Copyright (C) 2012-2013 The CyanogenMod Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.cyanogenmod.settings.device;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class Startup extends BroadcastReceiver {

    @Override
    public void onReceive(final Context context, final Intent bootintent) {
        HapticFragmentActivity.restore(context);
        VibratorTuningPreference.restore(context);
        SensorsFragmentActivity.restore(context);
        TouchscreenFragmentActivity.restore(context);
        Logo2MenuSwitch.restore(context);
        WakeMethod.restore(context);
        LongTapLogoSleepSwitch.restore(context);
        ButtonLightFragmentActivity.restore(context);
        ButtonLightNotificationSwitch.restore(context);
        MiscFragmentActivity.restore(context);
        FastChargeSwitch.restore(context);
        PocketDetectionMethod.restore(context);
        BacklightDisableSwitch.restore(context);
        F2WSensitivityMethod.restore(context);
        Flick2SleepSwitch.restore(context);
        Flick2WakeSwitch.restore(context);
        F2STimeOutMethod.restore(context);
    }
}
