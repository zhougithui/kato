package com.jsdx.kato.common.context;

import org.springframework.web.context.support.XmlWebApplicationContext;

/**
 * 拓展XmlWebApplicationContext
 * 
 * @author q
 *
 */
public class KatoXmlWebApplicationContext extends XmlWebApplicationContext {
	
	public KatoXmlWebApplicationContext(){
		System.out.println("init KatoXmlWebApplicationContext..");
	}
}
