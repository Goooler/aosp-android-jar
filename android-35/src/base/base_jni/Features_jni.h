// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.


// This file is autogenerated by
//     third_party/jni_zero/jni_generator.py
// For
//     android/net/connectivity/org/chromium/base/Features

#ifndef android_net_connectivity_org_chromium_base_Features_JNI
#define android_net_connectivity_org_chromium_base_Features_JNI

#include <jni.h>

#include "third_party/jni_zero/jni_export.h"
#include "third_party/jni_zero/jni_zero_helper.h"


// Step 1: Forward declarations.


// Step 2: Constants (optional).


// Step 3: Method stubs.
namespace base {
namespace android {

static jboolean JNI_Features_GetFieldTrialParamByFeatureAsBoolean(JNIEnv* env, jlong featurePointer,
    const base::android::JavaParamRef<jstring>& paramName,
    jboolean defaultValue);

JNI_BOUNDARY_EXPORT jboolean Java_android_net_connectivity_J_N_Mvs8D0NM(
    JNIEnv* env,
    jclass jcaller,
    jlong featurePointer,
    jstring paramName,
    jboolean defaultValue) {
  return JNI_Features_GetFieldTrialParamByFeatureAsBoolean(env, featurePointer,
      base::android::JavaParamRef<jstring>(env, paramName), defaultValue);
}

static base::android::ScopedJavaLocalRef<jstring>
    JNI_Features_GetFieldTrialParamByFeatureAsString(JNIEnv* env, jlong featurePointer,
    const base::android::JavaParamRef<jstring>& paramName);

JNI_BOUNDARY_EXPORT jstring Java_android_net_connectivity_J_N_MEUFDkLn(
    JNIEnv* env,
    jclass jcaller,
    jlong featurePointer,
    jstring paramName) {
  return JNI_Features_GetFieldTrialParamByFeatureAsString(env, featurePointer,
      base::android::JavaParamRef<jstring>(env, paramName)).Release();
}

static jboolean JNI_Features_IsEnabled(JNIEnv* env, jlong featurePointer);

JNI_BOUNDARY_EXPORT jboolean Java_android_net_connectivity_J_N_MWihnjab(
    JNIEnv* env,
    jclass jcaller,
    jlong featurePointer) {
  return JNI_Features_IsEnabled(env, featurePointer);
}


}  // namespace android
}  // namespace base

#endif  // android_net_connectivity_org_chromium_base_Features_JNI
