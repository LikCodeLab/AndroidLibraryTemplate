# AndroidRes
整理Android项目通用的资源

## 如何使用

### 1. 项目根目录的 build.gradle 的 buildscript 添加
```
allprojects {
     repositories {
        ...
        maven { url "https://jitpack.io" }
    }
}
```

### 2.然后在 dependencies 添加 

Latest Version：[![](https://jitpack.io/v/kennielab/AndroidRes.svg)](https://jitpack.io/#kennielab/AndroidRes)

```gradle
dependencies {
  implementation 'com.github.kennielab:AndroidRes:{Latest Version}'
}
```
