# V1 Tutorial

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

## Theme
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
	       implementation 'com.github.CuteLibs:CuteDialog:v-1.1'


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
                    .show();  // calls to show the dialog

```


## Customizations

#### Notes

* `setHeader` - it's a custom field to choose which type of header you want to use. Details at [Attributes/Enums](#enums)
* `setHeaderIcon` -  used to choose a icon, basically drawable/mipmap. Example, `R.drawable.icon` / `R.mipmap.ic_launcher`
* `setHeaderImage` -  used to choose a image, basically drawable. Example, `R.drawable.image`
* `setHeaderAnimation` - used to choose a animation from 'res/raw' folder. Example, `R.raw.anim`. Animtaion is shown using [Lottie for Android](https://github.com/airbnb/lottie-android) library.

![customizations](https://github.com/CuteLibs/CuteDialog/blob/master/files/details.jpg)

## Attributes 

#### Attributes

| Keyword | Values | 
|---------|--------|
| `setDialogStyle` | int `bgColor`, int `cornerRadius`, int `dialogPosition`, int `padding` |
| `isCancelable` | boolean `cancelable` | 
| `setCloseIconStyle` | int `iconResID`, int `sizeInDP`, int `colorOfIcon` | 
| `setHeader` | int `chooser` |  
| `setHeaderIcon` | int `icon` |  
| `setHeaderImage` | int `image` |  
| `setHeaderAnimation` | int `animation` |  
| `setTitle` | String titleText, int `textSizeInSP`, int `textColor`, int `textStyle` |  
| `setDesc` | String descText, int `textSizeInSP`, int `textColor`, int `textStyle` |  
| `setPositiveButtonStyle` | int `radiusOfButton`, int `bgColorOfButton`, int `borderColor`, int `borderWidth`, int `textSizeInSP` |  
| `setNegativeButtonStyle` | int `radiusOfButton`, int `bgColorOfButton`, int `borderColor`, int `borderWidth`, int `textSizeInSP` |  
| `setPositiveButtonText` | String `positiveText`, int `textColor`, int `textStyle` |  
| `setNegativeButtonText` | String `negativeText`, int `textColor`, int `textStyle` |  
| `setVisibilityOptions` | boolean `hideCloseIcon`, boolean `hideTitle`, boolean `hideDesc`, boolean `hidePositiveButton`, boolean `hideNegativeButton` |  
| `setPositiveButtonListener` | View.OnClickListener `listener` |  
| `setNegativeButtonListener` | View.OnClickListener `listener` |  
| `setCloseListener` | View.OnClickListener `listener` |  
| `show()`   |  

#### Enums

| Usage           | Keyword           | Value | 
|-----------------|-------------------|-------|
| Dialog Position | POSITION_CENTER   | 1     |
| Dialog Position | POSITION_TOP      | 2     |
| Dialog Position | POSITION_BOTTOM   | 3     |
| Text Style      | STYLE_NORMAL      | 1     |
| Text Style      | STYLE_BOLD        | 2     |
| Text Style      | STYLE_ITALIC      | 3     |
| Text Style      | STYLE_BOLD_ITALIC | 4     |
| Header Styler   | HEADER_ICON       | 1     |
| Header Styler   | HEADER_IMAGE      | 2     |
| Header Styler   | HEADER_ANIMATION  | 3     |
