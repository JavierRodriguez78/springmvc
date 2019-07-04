package com.geekshubsacademy.springmvc.components;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

@Component("ExampleComponent")
public class ExampleComponent {
  private static final Log Logger = LogFactory.getLog("ExmpleComponent");
  
  public void newComponent() {
	  Logger.info("Estas cargando tu componente");
  }
}
