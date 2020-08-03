package com.example.demo;

import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

interface Print {
  public void say(String str);
}

@RestController
public class CalculatorController {
  Print pri = (String str) -> { System.out.println(str);};

  @GetMapping("/")
  public Calculator default_func() {
    //format: http://localhost:8080/
    Calculator cal = new Calculator(0,0);
    cal.setResult(0);

    pri.say("a:" + cal.getA());
    pri.say("b:" + cal.getB());
    pri.say("result:" + cal.getResult());

    return cal;
  }

  @GetMapping("/add")
  public Calculator add(@RequestParam(name="a") int a, @RequestParam(name="b") int b) {
    //format: http://localhost:8080/add?a=5&b=6
    Calculator cal = new Calculator(a,b);
    cal.setResult(cal.add(a,b));

    pri.say("a:" + cal.getA());
    pri.say("b:" + cal.getB());
    pri.say("result:" + cal.getResult());

    return cal;
  }

  @GetMapping("/substract")
  public Calculator substract(@RequestParam(name="a") int a, @RequestParam(name="b") int b) {
    Calculator cal = new Calculator(a,b);

    cal.setResult(cal.substract(a,b));

    pri.say("a:" + cal.getA());
    pri.say("b:" + cal.getB());
    pri.say("result:" + cal.getResult());

    return cal;
  }

  @RequestMapping(name="/isEven/{a}", method=RequestMethod.GET)
  public Calculator isEven(@PathVariable(value="a") int a) {
    Calculator cal = new Calculator(a,0);

    cal.setResult(0);

    pri.say("a:" + cal.getA());
    pri.say("b:" + cal.getB());
    pri.say("result:" + cal.getResult());

    pri.say("isEven: " + cal.isEven(a) );

    return cal;
  }

}
