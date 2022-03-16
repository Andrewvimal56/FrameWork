package org.testNG.expriments;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;

public class Test11FailedAll implements IAnnotationTransformer {

	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
IRetryAnalyzer analyzer = annotation.getRetryAnalyzer();
if (analyzer==null) {
	annotation.setRetryAnalyzer(Test10Failed.class);
}
	}

//	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
//		
//		IRetryAnalyzer analyzer = annotation.getRetryAnalyzer();
//		if (analyzer == null) {
//			annotation.setRetryAnalyzer(Test10Failed.class);
//		}
//	}

}
