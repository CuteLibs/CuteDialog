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
![feature](https://github.com/CuteLibs/CuteDialog/raw/master/files/feature.jpg)


## Screenshot

| Icon | Image | Animation |
|---------|--------|----------|
|![icon](https://github.com/CuteLibs/CuteDialog/raw/master/files/shot1.png)|![image](https://github.com/CuteLibs/CuteDialog/raw/master/files/shot2.png)|![animation](https://github.com/CuteLibs/CuteDialog/raw/master/files/shot3.gif)|



## Demo
<a href="https://github.com/CuteLibs/CuteDialog/raw/master/files/Cute%20Dialog.apk">Download</a> and Give it a try.


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
		implementation 'com.github.CuteLibs:CuteDialog:m-beta-0.1'

}
```
## Usage

### Basic

``` java
            new CuteDialog(this)
                    .setHeader(CuteDialog.HEADER_ICON)
                    .setHeaderIcon(R.drawable.icon_1)
                    .setTitle("Wrong Time", 0, 0, 0)
                    .setDesc("You can't do this right now.\nTry Later", 0, 0, 0)
		            .setPositiveButtonListener(v1 -> {
                        Toast.makeText(this, "Positive Button Clicked", Toast.LENGTH_SHORT).show();
                    }) 
                    .setNegativeButtonListener(v12 -> {
                        Toast.makeText(this, "Negative Button Clicked", Toast.LENGTH_SHORT).show();
                    }) 
                    .show();

```

### Advanced

``` java
            new CuteDialog(this)
                    .setDialogStyle(Color.WHITE,10,CuteDialog.POSITION_CENTER,10) // Whole Dialog Style
                    .isCancelable(true) // Dialog Cancelable when clicked outside
                    .setCloseIconStyle(0,30,Color.DKGRAY) // Close Icon Style
                    .setHeader(CuteDialog.HEADER_IMAGE) // Header Type
                    .setHeaderImage(R.drawable.image_4) // Image Header 
                    .setTitle("Something is Wrong", 0, Color.parseColor("#673AB7"), 0) // Title with Design
                    .setDesc("I don't know what went wrong, but there is a problem.", 0, 0, 0) // Description with Design
                    .setPositiveButtonText("Try Again",  Color.parseColor("#673AB7"), 0) // Positive Button Text with Design
                    .setNegativeButtonText("Cancel",  Color.parseColor("#673AB7"), 0) // Negative Button Text with Design
                    .setPositiveButtonStyle(0, Color.parseColor("#673AB7"), 0, 0, 0) // Positive Button Style
                    .setNegativeButtonStyle(0, 0, Color.parseColor("#673AB7"), 0, 0) // Negative Button Style 
                    .setPositiveButtonListener(v1 -> {
                        Toast.makeText(this, "Positive Button Clicked", Toast.LENGTH_SHORT).show();
                    }) // Positive Button Click Listener
                    .setNegativeButtonListener(v12 -> {
                        Toast.makeText(this, "Negative Button Clicked", Toast.LENGTH_SHORT).show();
                    }) // Negative Button click Listener
                    .setCloseListener(v13 -> {
                        Toast.makeText(this, "Close Icon Clicked", Toast.LENGTH_SHORT).show();
                    }) // Close Icon click Listener
                    .show();

```


## Customizations

![customizations](https://github.com/CuteLibs/CuteDialog/blob/master/files/details.jpg)

## Attributes 

#### Attributes

| Keyword | Attributes | 
|---------|--------|
| setDialogStyle | int bgColor, int cornerRadius, int dialogPosition, int padding |
| isCancelable | boolean cancelable | 
| setCloseIconStyle | int iconResID, int sizeInDP, int colorOfIcon | 
| setHeader | int chooser |  
| setHeaderIcon | int icon |  
| setHeaderImage | int image |  
| setHeaderAnimation | int animation |  
| setTitle | String titleText, int textSizeInSP, int textColor, int textStyle |  
| setDesc | String descText, int textSizeInSP, int textColor, int textStyle |  
| setPositiveButtonStyle | int radiusOfButton, int bgColorOfButton, int borderColor, int borderWidth, int textSizeInSP |  
| setNegativeButtonStyle | int radiusOfButton, int bgColorOfButton, int borderColor, int borderWidth, int textSizeInSP |  
| setPositiveButtonText | String positiveText, int textColor, int textStyle |  
| setNegativeButtonText | String negativeText, int textColor, int textStyle |  
| setVisibilityOptions | boolean hideCloseIcon, boolean hideTitle, boolean hideDesc, boolean hidePositiveButton, boolean hideNegativeButton |  
| setPositiveButtonListener | View.OnClickListener listener |  
| setNegativeButtonListener | View.OnClickListener listener |  
| setCloseListener | View.OnClickListener listener |  
| show | Must Call |  

#### Enums

| Keyword | Value | 
|---------|--------|
| POSITION_CENTER | 1 |
| POSITION_TOP | 2 |
| POSITION_BOTTOM | 3 |
| STYLE_NORMAL | 1 |
| STYLE_BOLD | 2 |
| STYLE_ITALIC | 3 |
| STYLE_BOLD_ITALIC | 4 |
| HEADER_ICON | 1 |
| HEADER_IMAGE | 2 |
| HEADER_ANIMATION | 3 |

## More Demo

![collage](https://github.com/CuteLibs/CuteDialog/raw/master/files/collage.jpg)



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
