
# Flag Bus

[![](https://jitpack.io/v/VerstSiu/flag_bus.svg)](https://jitpack.io/#VerstSiu/flag_bus)

Android flag bus library.

## Get Start

1. Add `jitpack` repository to root `build.gradle`:

    ```gradle
    allprojects {
        repositories {
            ...
            maven { url 'https://jitpack.io' }
        }
    }
    ```

2. Add library dependency to project's `build.gradle`:

    ```gradle
    dependencies {
        implementation 'com.github.VerstSiu:flag_bus:1.0'
    }
    ```

## Usage

1. Config flag status at your custom application:

    ```kotlin
    class MyApplication: Application() {
      override fun onCreate() {
        super.onCreate()
        
        FlagBus.apply {
          isDebugEnabled = BuildConfig.DEBUG
          isTestEnabled = true
          isBetaEanbled = false
          //..
        }
      }
    }
    ```

2. Query flag status when you needed:

    ```kotlin
    fun init() {
       if (FlagBus.isDebugEnabled) {
         debug_tip.visibility = View.VISIBLE
       }
    }
    ```

## Extend

1. Add your custom extension and put it inside `FlagBusKt`:

    ```kotlin
    // _FlagBus.kt
    @file:kotlin.jvm.JvmMultifileClass
    @file:kotlin.jvm.JvmName("FlagBusKt")
 
    /**
     * Skin enabled status.
     *
     * <p>Default as <code>false</code></p>
     */
    var FlagBus.isSkinEnabled = false
    ```

2. Add flag config to your custom application.

3. Add flag dependency to your library project and use flag status when you needed.

## License

```

   Copyright(c) 2017 VerstSiu

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.

```
