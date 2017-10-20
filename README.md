# LatteNewsWithKotlin
A News App With Kotlin.

## 添加依赖

```gradle
dependencies = [
        kotlinStdlib       : 'org.jetbrains.kotlin:kotlin-stdlib:$kotlin_version',
        butterknife        : 'com.jakewharton:butterknife:8.8.1',
        butterknifeCompiler: 'com.jakewharton:butterknife-compiler:8.8.1',
        glide              : 'com.github.bumptech.glide:glide:3.8.0',
        ankoSdk15          : 'org.jetbrains.anko:anko-sdk15:0.9',
        ankoSupportV4      : 'org.jetbrains.anko:anko-support-v4:0.9',
        ankoAppcompatV7    : 'org.jetbrains.anko:anko-appcompat-v7:0.9'
]
```

## Kotlin学习细节

- 非空处理

方式一：安全访问?.
```java
builder?.setDecodeFormat(DecodeFormat.PREFER_ARGB_8888)
```
方式二：添加非空断言!!
```java
builder!!.setDecodeFormat(DecodeFormat.PREFER_ARGB_8888)
```
方式三：使用非空检查
```java
if (builder != null) {
    builder.setDecodeFormat(DecodeFormat.PREFER_ARGB_8888)
}
```

- Glide图片加载需要手动设置在子线程

在Java中，使用Glide进行网络图片的加载，貌似不需要另起线程呢！为什么Kotlin需要呢？
```java
java.lang.RuntimeException: Unable to start activity ComponentInfo{com.dyx.lnwk/com.dyx.lnwk.ui.activity.MainActivity}: android.os.NetworkOnMainThreadException
    at android.app.ActivityThread.performLaunchActivity(ActivityThread.java:2665)
    at android.app.ActivityThread.handleLaunchActivity(ActivityThread.java:2726)
    at android.app.ActivityThread.-wrap12(ActivityThread.java)
    at android.app.ActivityThread$H.handleMessage(ActivityThread.java:1477)
    at android.os.Handler.dispatchMessage(Handler.java:102)
    at android.os.Looper.loop(Looper.java:154)
    at android.app.ActivityThread.main(ActivityThread.java:6119)

                                                                  at java.lang.reflect.Method.invoke(Native Method)
    at com.android.internal.os.ZygoteInit$MethodAndArgsCaller.run(ZygoteInit.java:886)
    at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:776)
```

## 使用到的开源库

- [Anko](https://github.com/Kotlin/anko)
- [Glide](https://github.com/bumptech/glide)