# Add any ProGuard configurations specific to this
# extension here.

-keep public class com.brandonang.largeprogressbar.LargeProgressBar {
    public *;
 }
-keeppackagenames gnu.kawa**, gnu.expr**

-optimizationpasses 4
-allowaccessmodification
-mergeinterfacesaggressively

-repackageclasses 'com/brandonang/largeprogressbar/repack'
-flattenpackagehierarchy
-dontpreverify
