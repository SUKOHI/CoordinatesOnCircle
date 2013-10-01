package com.sukohi.lib;

import android.graphics.PointF;

public class CoordinatesOnCircle {

	public static PointF get(float x, float y, float radius, int angle) {
		
		double radian = Math.PI/180 * angle;
		return new PointF(
				(float) (x + radius * Math.cos(radian)), 
				(float) (y + radius * Math.sin(radian))
		);
		
	}
	
}

/***Sample

	PointF shotgunPointF = CoordinatesOnCircle.get(x, y, radius, angle);

***/