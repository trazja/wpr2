package tryhut.wpr;

import com.bumptech.glide.annotation.GlideModule;
import com.bumptech.glide.module.AppGlideModule;

/**
 * Created by tryhu on 2018-08-16.
 */
@GlideModule
public class MyGlideApp extends AppGlideModule{
    @Override
    public boolean isManifestParsingEnabled(){
        return false;
    }
}
