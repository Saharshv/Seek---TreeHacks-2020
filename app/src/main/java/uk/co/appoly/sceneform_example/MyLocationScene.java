package uk.co.appoly.sceneform_example;

import android.app.Activity;
import android.content.Context;
import com.google.ar.core.Frame;

import com.google.ar.sceneform.ArSceneView;

public class MyLocationScene extends uk.co.appoly.arcorelocation.LocationScene{
    public MyLocationScene(Context mContext, Activity mActivity, ArSceneView mArSceneView) {
        super(mContext, mActivity, mArSceneView);
    }

    public void refreshAnchorsIfRequired(Frame frame) {
        return;
    }
}
