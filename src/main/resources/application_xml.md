#<?xml version="1.0" encoding="UTF-8"?>
#<beans xmlns="http://www.springframework.org/schema/beans"
#       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
#       xmlns:context="http://www.springframework.org/schema/context"
#       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd http://www.springframework.org/schema/context https://www.springframework.org/schema/context/spring-context.xsd">
#
#    <!-- 굉장히 번거로움 -->
#<!--    <bean id="bookService" class="com.jaenyeong.springapplicationcontext.ComponentScan.BookService">-->
#<!--        &lt;!&ndash; property name : setter Name &ndash;&gt;-->
#<!--        &lt;!&ndash; property ref : Bean ID &ndash;&gt;-->
#<!--        <property name="bookRepository" ref="bookRepository"/>-->
#<!--    </bean>-->
#
#<!--    <bean id="bookRepository" class="com.jaenyeong.springapplicationcontext.ComponentScan.BookRepository">-->
#<!--    </bean>-->
#
#    <!-- 위 방법 대신 빈 컴포넌트를 스캔하는 방법 -->
#    <context:component-scan base-package="com.jaenyeong.springapplicationcontext"/>
#
#</beans>
