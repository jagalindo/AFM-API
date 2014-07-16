/*
	This file is part of FaMaTS.

    FaMaTS is free software: you can redistribute it and/or modify
    it under the terms of the GNU Lesser General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    FaMaTS is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU Lesser General Public License for more details.

    You should have received a copy of the GNU Lesser General Public License
    along with FaMaTS.  If not, see <http://www.gnu.org/licenses/>.

 */
package fr.familiar.attributedfm.domain;


/**
 * Represents a Range
 */
public class Range {

	private Integer max;
	private Integer min;
	private Integer delta;
	
	public Range(Integer min, Integer max) {
		this.max = max;
		this.min = min;
	}

	public Range(Integer min, Integer max, Integer delta) {
		this.max = max;
		this.min = min;
		this.delta=delta;
	}
	public Integer getMax() {
		return max;
	}

	public Integer getDelta(){
		return delta;
	}
	
	public void setDelta(int delta){
		this.delta=delta;
	}
	
	public Integer getMin() {
		return min;
	}

	public void setMax(int max) {
		this.max = max;
	}

	public void setMin(int min) {
		this.min = min;
	}
	
	public boolean isInRange(int i){
		if (i <= max && i >= min){
			return true;
		}
		else{
			return false;
		}
	}
	
	
}
