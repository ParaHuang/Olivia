package day4;

class MathVector {
    private final int      dim;
    private final double[] values;


    public MathVector(int N) {
        dim    = N;
        values = new double[N];
            for (int i = 0; i < N; i++){
                values[i] = 0.0;
            }
    }
    public MathVector(double... arr) {
        dim    = arr.length;
        values = new double[dim];
            for (int i = 0; i < dim; i++){
                values[i] = arr[i];
            }
    }
    public MathVector(MathVector v) {
        dim    = v.dim;
        values = new double[dim];
            for (int i = 0; i < dim; i++){
                values[i] = v.values[i];
            }
    }


    public static MathVector vec2DfromPolar(double r, double theta) {
        double cos = r * Math.cos(theta);
        double sin = r * Math.sin(theta);
        return new MathVector(cos, sin);
    }

    public static MathVector vec3DfromPolar(double r, double theta, double phi) {
        double x = r * Math.sin(theta) * Math.cos(phi);
        double y = r * Math.sin(theta) * Math.sin(phi);
        double z = r * Math.cos(theta);
        return new MathVector(x, y, z);
    }


    public int getDimension() { 
        return dim; 
    }


    public double getValue(int idx) { 
        return values[idx - 1]; 
    }

    public void setValue(int idx, double val) {

        values[idx - 1] = val;
    }


    //5-a-1
    public double dotWith(MathVector other) { 
    	
    	double result = 0;
    	
    	for(int i=0 ; i<values.length ; i++) {
    		result += values[i]*other.values[i];
    	}
    	
    	return result; 
    }
    //5-a-2
    public double getMagnitude() { 
    	double result = 0;
    	
    	for(double d:values) {
    		result += d*d;
    	}
    	
    	return Math.sqrt(result); 
    }

    //5-b-1
    public void scaleBy(double scalar) {
    	for(int i=0 ; i<values.length ; i++) {
    		values[i]*=scalar;
    	}
    }
    //5-b-2
    public static MathVector multiply(double scalar, MathVector v) {
    	double[] ary = v.values;
    	MathVector newVector = new MathVector(ary);
    	newVector.scaleBy(scalar);
    	return newVector;
    }
    //5-c-1
    public void shiftBy(MathVector other) {
    	double[] ary = other.values;
    	for(int i=0 ; i<values.length ; i++) {
    		values[i]+=ary[i];
    	}
    }
    //5-c-2
    public static MathVector add(MathVector v1, MathVector v2) {
    	MathVector newVector = new MathVector(v1);
    	newVector.shiftBy(v2);
        return newVector;
    }
    
    //5-e
    public static MathVector add(MathVector... vs) {
    	if(vs==null || vs.length ==0) {
    		return null;
    	}
    	MathVector newVector = new MathVector(vs[0]);
    	for(int i=1 ; i<vs.length ; i++) {
    		newVector.shiftBy(vs[i]);
    	}
    	
        return newVector;
    }

    //5-d
    public boolean equals(MathVector other) { 
    	if(this==other) {
    		return true;
    	}
    	if(other==null) {
    		return false;
    	}
    	if(values.length != other.values.length) {
    		return false;
    	}
    	
    	for(int i=0 ; i<values.length ; i++) {
    		if(values[i]!=other.values[i]) {
    			return false;
    		}
    	}
    	return true;
    }


    public String toString() { 
        return java.util.Arrays.toString(values); 
        }
    public void print() { 
        System.out.print("[");
        for (int i = 0; i < values.length; i++){
            System.out.print(values[i]);
            if (i < values.length - 1){
                System.out.print(", ");
            }
        }
        System.out.print("]\n");
    }
}








