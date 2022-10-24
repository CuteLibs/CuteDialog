<p align="center"><img src="https://github.com/CuteLibs/CuteDialog/raw/master/files/libaray_icon.png" height="70" alt="GitHub forks"> <img src="https://github.com/CuteLibs/CuteDialog/raw/master/files/Cute_Dialog.png" height="80" alt="Cute Dialog"> </p>

<p align="center"> <a href="https://www.android.com"><img src="https://img.shields.io/badge/platform-Android-yellow.svg" alt="platform"></a>
 <a href="https://android-arsenal.com/api?level=21"><img src="https://img.shields.io/badge/API-21%2B-brightgreen.svg?style=flat" alt="API"></a> <a href="https://jitpack.io/#CuteLibs/CuteDialog/"><img src="https://jitpack.io/v/CuteLibs/CuteDialog.svg" alt="JitPack"></a> <a href="https://github.com/CuteLibs/CuteDialog/blob/master/LICENSE"><img src="https://img.shields.io/github/license/CuteLibs/CuteDialog" alt="GitHub license"></a> </p>
 
 
<h3 align="center"><b>A Custom Material Design Dialog Library for Android</b></h3>



 <p align="center"> <a href="https://github.com/CuteLibs/CuteDialog/issues"><img src="https://img.shields.io/github/issues/CuteLibs/CuteDialog" alt="GitHub issues"></a> <a href="https://github.com/CuteLibs/CuteDialog/network"><img src="https://img.shields.io/github/forks/CuteLibs/CuteDialog" alt="GitHub forks"></a> <a href="https://github.com/CuteLibs/CuteDialog/stargazers"><img src="https://img.shields.io/github/stars/CuteLibs/CuteDialog" alt="GitHub stars"></a> <a href="https://github.com/CuteLibs/CuteDialog/graphs/contributors"> <img src="https://img.shields.io/github/contributors/CuteLibs/CuteDialog" alt="GitHub contributors"></a> <img src="https://img.shields.io/github/languages/code-size/CuteLibs/CuteDialog" alt="Code Size">  </p>
  
 <p align="center"> <img src="https://github.com/CuteLibs/CuteDialog/actions/workflows/android.yml/badge.svg" alt="Build"/> <a href="https://www.codacy.com/gh/CuteLibs/CuteDialog/dashboard?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=CuteLibs/CuteDialog&amp;utm_campaign=Badge_Grade"><img src="https://app.codacy.com/project/badge/Grade/b46743b23bf041819fb5232ba87fb17e" alt="Code Quality"></a> <a href="https://www.codefactor.io/repository/github/cutelibs/cutedialog"><img src="https://www.codefactor.io/repository/github/cutelibs/cutedialog/badge" alt="CodeFactor" /></a></p>

<br/>

## Purpose
<b>CuteDialog</b> is a Highly Customizable Material Design Android Library. <b>CuteDialog</b> allows developer to create beautiful dialogs with <b>material design</b>. It is highly <b>customizable</b> and can be used for lots of different purposes.

## Features
![feature](https://github.com/CuteLibs/CuteDialog/raw/master/files/feature.jpg)


## Screenshot

| Icon | Image | Animation |
|---------|--------|----------|
|![icon](https://github.com/CuteLibs/CuteDialog/raw/master/files/shot1.png)|![image](https://github.com/CuteLibs/CuteDialog/raw/master/files/shot2.png)|![animation](https://github.com/CuteLibs/CuteDialog/raw/master/files/shot3.gif)|



## Demo
<a href="https://github.com/CuteLibs/CuteDialog/raw/master/files/Cute%20Dialog.apk">Download</a> and Give it a try.


## Prerequisites

### Gradle

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

### Theme
For using <b>CuteDialog</b> in your project, you must use <b>Material Theme</B> in your project. You can use <b>CuteDialog</b> in both <b>Material</b>  <b>Light</b> and <b>Dark</b> theme.

For example:
    
 ```xml

    <style name="AppTheme" parent="Theme.MaterialComponents.Light.DarkActionBar">
	    
        <!-- Customize your theme here. -->
	    
    </style>
```
Or

```xml

    <style name="AppTheme" parent="Theme.MaterialComponents.DayNight.DarkActionBar">
	    
        <!-- Customize your theme here. -->
	    
    </style>

```


## Dependencies
Add this to your app level `build.gradle`:

(Always use the latest version. Current Latest version is <a href="https://jitpack.io/#CuteLibs/CuteDialog"><img src="https://jitpack.io/v/CuteLibs/CuteDialog.svg" alt="JitPack"></a> )

```gradle
dependencies {
	...
	        implementation 'com.github.CuteLibs:CuteDialog:v-2.1'


}
```
## Usage ( [Wiki](https://github.com/CuteLibs/CuteDialog/wiki) )  ( [Old Usage](files/README_V1.md) )

### Basic

``` java
       new CuteDialog.withIcon(this)
                        .setIcon(R.mipmap.ic_launcher)
                        .setTitle("Simple Dialog")
                        .setDescription("This is a simple Dialog")
                        .setPositiveButtonText("Okay", v2 -> {
                        })
                        .setNegativeButtonText("Cancel", v2 -> {
                        })
                        .show();     	

```

### Advanced

``` java
                new CuteDialog.withIcon(this)
                        .setIcon(R.mipmap.ic_launcher)
                        .setTitle("Simple Dialog")
                        .setTitleTextSize(20)
                        .setTitleTextColor(Color.parseColor("#FF4081"))
                        .setTitleTextStyle(CuteDialog.STYLE_BOLD)
                        .setDescription("This is a simple Dialog")
                        .setDescriptionTextColor(Color.parseColor("#FF4081"))
                        .setDescriptionTextSize(16)
                        .setDescriptionTextStyle(CuteDialog.STYLE_NORMAL)
                        .setPositiveButtonText("Okay", v2 -> {
                        })
                        .setNegativeButtonText("Cancel", v2 -> {
                        })
                        .setCloseIconListener(v2 -> {
                        })
                        .setCloseIcon(R.drawable.icon_1)
                        .setCloseIconColor(Color.parseColor("#FF4081"))
                        .setCloseIconSize(20)
                        .setPositiveButtonColor(Color.parseColor("#FF4081"))
                        .setPositiveButtonRadius(10)
                        .setPositiveButtonBorderColor(Color.parseColor("#FF4081"))
                        .setPositiveButtonBorderWidth(2)
                        .setPositiveButtonTextColor(Color.parseColor("#FFFFFF"))
                        .setPositiveButtonTextSize(16)
                        .setPositiveButtonTextStyle(CuteDialog.STYLE_NORMAL)
                        .setNegativeButtonColor(Color.parseColor("#FFFFFF"))
                        .setNegativeButtonRadius(10)
                        .setNegativeButtonBorderColor(Color.parseColor("#FF4081"))
                        .setNegativeButtonBorderWidth(2)
                        .setNegativeButtonTextColor(Color.parseColor("#FF4081"))
                        .setNegativeButtonTextSize(16)
                        .setNegativeButtonTextStyle(CuteDialog.STYLE_NORMAL)
                        .setDialogBackgroundColor(Color.parseColor("#FFFFFF"))
                        .setDialogRadius(10)
                        .setDialogPosition(CuteDialog.POSITION_CENTER)
                        .setPadding(20)
                        .setPrimaryColor(Color.parseColor("#FF4081"))
                        .isCancelable(true)
                        .hideNegativeButton(false)
                        .hidePositiveButton(false)
                        .hideDescription(false)
                        .hideTitle(false)
                        .hideCloseIcon(false)
                        .show();		

```

## Theme ( [Wiki](https://github.com/CuteLibs/CuteDialog/wiki) ) 

### with Icon

Call `new CuteDialog.withIcon(this)` for using a **Icon** as header and use `.setIcon` to set the resource.

**Example:**

``` java
      new CuteDialog.withIcon(this)
                        .setIcon(R.mipmap.ic_launcher)
                        .setTitle("Simple Dialog")
                        .setDescription("This is a simple Dialog")
                        .show();    
			
```

### with Image

Call `new CuteDialog.withImage(this)` for using a **Image** as header and use `.setImage` to set the resource.


**Example:**

``` java
	 new CuteDialog.withImage(this)
                        .setImage(R.drawable.image_1)
                        .setTitle("Take a break")
                        .setDescription("Isn't it a great time to go for a walk?")
                        .show();

```

### with Animation

Call `new CuteDialog.withAnim(this)` for using a **Image** as header and use `.setAnimation` to set the resource. Put the Animation in `res/raw` folder

**Example:**

``` java
	   new CuteDialog.withAnimation(this)
                        .setAnimation(R.raw.anim1)
                        .setTitle("Set Reminder")
                        .setDescription("Do you want me to remind you? ")
                        .show(); 


```



## Customizations ( [Wiki](https://github.com/CuteLibs/CuteDialog/wiki) ) 

#### Notes

* `new CuteDialog.withIcon(this)` - use an icon as header, basically drawable/mipmap. Example, `R.drawable.icon` / `R.mipmap.ic_launcher`
* `new CuteDialog.withImage(this)` -  use an image as header, basically drawable. Example, `R.drawable.image`
* `new CuteDialog.withAnimation(this)` -  use an animation as header, from 'res/raw' folder. Example, `R.raw.anim`. Animtaion is shown using [Lottie for Android](https://github.com/airbnb/lottie-android) library.

![customizations](https://github.com/CuteLibs/CuteDialog/blob/master/files/details.jpg)

## More Demo

![collage](https://github.com/CuteLibs/CuteDialog/raw/master/files/collage.jpg)



## Contribute
Please fork this repository and contribute back using [pull requests](https://github.com/CuteLibs/CuteDialog/pulls).

Any contributions, large or small, major features, bug fixes, are welcomed and appreciated.

Let me know which features you want in the future in `Request Feature` tab. 

If this project helps you a little bit, then give a to Star ⭐ the Repo. 

## Credits

Created with ❤️ by <a href="https://github.com/CuteLibs"> CuteLibs </a> & <a href="https://github.com/ahmmedrejowan"> K M Rejowan Ahmmed </a>

* Animation - [Lottie for Android](https://github.com/airbnb/lottie-android) library

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
