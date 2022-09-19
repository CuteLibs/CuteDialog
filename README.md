<p align="center"><img src="https://github.com/CuteLibs/CuteDialog/raw/master/files/library_icon.png" height="70" weight="70" alt="GitHub forks"> <img src="https://github.com/CuteLibs/CuteDialog/raw/master/files/Cute_Dialog.png" height="80" alt="Cute Dialog"> </p>

<p align="center"> <a href="https://www.android.com"><img src="https://img.shields.io/badge/platform-Android-yellow.svg" alt="platform"></a>
 <a href="https://android-arsenal.com/api?level=21"><img src="https://img.shields.io/badge/API-21%2B-brightgreen.svg?style=flat" alt="API"></a> <a href="https://jitpack.io/#CuteLibs/CuteDialog/"><img src="https://jitpack.io/v/CuteLibs/CuteDialog.svg" alt="JitPack"></a> <a href="https://github.com/CuteLibs/CuteDialog/blob/master/LICENSE"><img src="https://img.shields.io/github/license/CuteLibs/CuteDialog" alt="GitHub license"></a> </p>
 
 
<h3 align="center"><b>A Custom Material Design Dialog Library for Android</b></h3>



 <p align="center"> <a href="https://github.com/CuteLibs/CuteDialog/issues"><img src="https://img.shields.io/github/issues/CuteLibs/CuteDialog" alt="GitHub issues"></a> <a href="https://github.com/CuteLibs/CuteDialog/network"><img src="https://img.shields.io/github/forks/CuteLibs/CuteDialog" alt="GitHub forks"></a> <a href="https://github.com/CuteLibs/CuteDialog/stargazers"><img src="https://img.shields.io/github/stars/CuteLibs/CuteDialog" alt="GitHub stars"></a> <a href="https://github.com/CuteLibs/CuteDialog/graphs/contributors"> <img src="https://img.shields.io/github/contributors/CuteLibs/CuteDialog" alt="GitHub contributors"></a> <img src="https://img.shields.io/github/languages/code-size/CuteLibs/CuteDialog" alt="Code Size">  </p>
  
 <p align="center"> <img src="https://github.com/CuteLibs/CuteDialog/actions/workflows/android.yml/badge.svg" alt="Build"/> <a href="https://www.codacy.com/gh/CuteLibs/CuteDialog/dashboard?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=CuteLibs/CuteDialog&amp;utm_campaign=Badge_Grade"><img src="https://app.codacy.com/project/badge/Grade/b46743b23bf041819fb5232ba87fb17e" alt="Code Quality"></a> <a href="https://www.codefactor.io/repository/github/cutelibs/cutedialog"><img src="https://www.codefactor.io/repository/github/cutelibs/cutedialog/badge" alt="CodeFactor" /></a> </p>

<br/>

## Purpose
<b>CuteDialog</b> is a Highly Customizable Material Design Android Library. <b>CuteDialog</b> allows developer to create beautiful dialogs with <b>material design</b>. It is highly <b>customizable</b> and can be used for lots of different purposes.

## Features
- Material Design UI
- 3 Header Designs
- Highly Customizable

## Build Info
This library is built by this conifg:
- Minimum SDK 21
- Compile SDK 32
- Target SDK 32
- Built on Java 1.8
- Androidx Library
- <a href="https://github.com/airbnb/lottie-android">Lottie</a> for Animation

## Screenshot

| Icon | Image | Animation |
|---------|--------|----------|
|![icon](https://github.com/CuteLibs/CuteDialog/raw/master/files/shot1.png)|![image](https://github.com/CuteLibs/CuteDialog/raw/master/files/shot2.png)|![animation](https://github.com/CuteLibs/CuteDialog/raw/master/files/shot3.gif)|


## Demo
<a href="https://rejowan.com">Download</a> and Give it a try.


## Prerequisites

#### Old
If you're using old gradle versions then follow this.
Add this in your root `build.gradle` :

```gradle
allprojects {
	repositories {
		...
		maven { url "https://jitpack.io" }
	}
}
```

#### New
If you're using new gradle versions then follow this.
Add this in your `settings.gradle` file:

```gradle
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
       ...
        maven { url 'https://jitpack.io' }

    }
}
```

## Dependencies
Add this to your app level `build.gradle`:

(Always use the latest version. Current Latest version is <a href="https://jitpack.io/#CuteLibs/CuteDialog"><img src="https://jitpack.io/v/CuteLibs/CuteDialog.svg" alt="JitPack"></a> )

```gradle
dependencies {
	...
		implementation 'com.github.CuteLibs:CuteDialog:beta-0.3'

}
```


## Contribute
Please fork this repository and contribute back using [pull requests](https://github.com/CuteLibs/CuteDialog/pulls).

Any contributions, large or small, major features, bug fixes, are welcomed and appreciated.

Let me know which features you want in the future in `Request Feature` tab. 

If this project helps you a little bit, then give a to Star ⭐ the Repo. 

## Credits

Created with ❤️ by <a href="https://github.com/CuteLibs"> CuteLibs </a> & <a href="https://github.com/ahmmedrejowan"> K M Rejowan Ahmmed </a>

## License
* [Apache Version 2.0](http://www.apache.org/licenses/LICENSE-2.0.html)

```
Copyright 2022 CuteLibs

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
