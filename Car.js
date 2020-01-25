class Car
{
    run(type)
    {
        this.type=type
    }
        disp()
        {
        console.log("car")
        }
    
}
class MarutiSuzuki extends Car
{
run(type,id,color)
{
    super.run
    this.id=id
    this.color
}
disp(){
console.log("car 1")
}
}

class Mz extends MarutiSuzuki
{
    run(type,id,color,speed,engine)
    {
        super.run
        this.speed=speed
        this.engine=engine
    }
    disp()
    {

    
        console.log("car 2")
    }
    
}
var a=new Mz(car1,55,b,80,w)
a.run()

