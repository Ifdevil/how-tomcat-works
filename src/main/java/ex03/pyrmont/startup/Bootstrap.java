package ex03.pyrmont.startup;

import ex03.pyrmont.connector.http.HttpConnector;

/**
 * tomcat启动入口
 */
public final class Bootstrap {
  public static void main(String[] args) {
    HttpConnector connector = new HttpConnector();
    connector.start();
  }
}