/*
 * Copyright 2014 Efferic
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.efferic.ejaber.coordinate;

import com.efferic.ejaber.view.Size;

public class ScaleCoordinate {
	private Size screenSize;
	private Size fixedSize;

	public ScaleCoordinate() {
		this.screenSize = new Size();
		this.fixedSize = new Size();
	}

	public ScaleCoordinate(int screenWidth, int screenHeight, int fixedWidth, int fixedHeight) {
		this.screenSize = new Size(screenWidth, screenHeight);
		this.fixedSize = new Size(fixedWidth, fixedHeight);
	}

	public ScaleCoordinate(Size screenSize, Size fixedSize) {
		this.screenSize = screenSize;
		this.fixedSize = fixedSize;
	}

	public int getX(int x) {
		int diff = screenSize.getWidth() - fixedSize.getWidth();
		diff = screenSize.getWidth() / diff;
		diff = 1 / diff;
		return x - (x * diff);
	}

	public int getY(int y) {
		int diff = screenSize.getHeight() - fixedSize.getHeight();
		diff = screenSize.getHeight() / diff;
		diff = 1 / diff;
		return y - (y * diff);
	}
}
