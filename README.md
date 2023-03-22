# CircularPercentageProgressbar

# Screen Shot
![This is an image](https://s4.aconvert.com/convert/p3r68-cdx67/ayic2-yb8ka.jpg)
![This is an image](https://s4.aconvert.com/convert/p3r68-cdx67/a3agx-3tnyn.jpg)
![This is an image](https://s4.aconvert.com/convert/p3r68-cdx67/aicii-57905.jpg)

### How to Use

Step 1. Add it in your root build.gradle at the end of repositories:
```allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}

```
```
Step 2. Add the dependency
dependencies {
	        	        implementation 'com.github.TecOrb-Developers:CircularPercentageProgressbar:v1.0.0'
	}
```


Step 3 .Add CircleProgressBar to your layout

~~~
      <com.tecorb.circularprogressbar.CircleProgressBar
      	xmlns:cpb="http://schemas.android.com/apk/res-auto"
          android:id="@+id/progressBar"
          android:layout_width="150dp"
          android:layout_height="150dp"
          cpb:progressColor="#e76130"
          cpb:backgroundColor="#e7b330"
          cpb:dimension="14"
          cpb:backgroundWidth="8"
          cpb:textSize="18sp"
          cpb:roundedCorners="true"
          cpb:suffix="%"
          cpb:prefix=""
          cpb:progressText="Loading..."
          cpb:maxValue="100"
          cpb:progressTextColor="#f9916b"/>

  ~~~

  Step 4. Get it from your activity/fragment etc.

  ```
     val progressBar = findViewById<View>(R.id.asd) as CircleProgressBar
     progressBar.progress = 50f
             progressBar.setProgressText(progressBar.progress.toString())
             progressBar.setProgressColor(resources.getColor(R.color.purple_200))
             progressBar.suffix = "%"
  ```

  step 5. You can modify it programmatically if you want

### Setters
  ```

   progressBar.setProgress(progress); 		// set progress value
	progressBar.setMaxValue(100); 			// set progress max value
	progressBar.setStrokeWidthDimension(10); 		// set stroke width
	progressBar.setBackgroundWidth(10); 		// set progress background width
	progressBar.setProgressColor("#FF6FD99D"); 	// set progress color
	progressBar.setBackgroundColor("#FFF9916B"); 	// set progress backgorund color
	progressBar.setText(String.valueOf(progress)); 	// set progress text
	progressBar.setTextColor("#FF6FD99D"); 		// set text color
	progressBar.setSuffix("%"); 			// set suffix
	progressBar.setPrefix("");




  ```


  ### Getters

  ```
    progressBar.getProgress();			// get progress value
	progressBar.getProgressPercentage();		// get progress percentage
	progressBar.getMaxValue();			// get progress max value
	progressBar.getStrokeWidthDimension();			// get stroke width
	progressBar.getBackgroundWidth();		// get progress background width
	progressBar.getProgressColor();			// get progress color
	progressBar.getBackgroundColor();		// get progress backgorund color
	progressBar.getText();  			// get progress text
	progressBar.getTextColor();			// get text color
	progressBar.getSuffix();			// get suffix
	progressBar.getPrefix();			// get prefix

  ```
