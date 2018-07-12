package com.example.lk.kotlinaction
import org.junit.Test

class MainActivity {
    /**
     * 定义属性
     */
    @Test
    fun FiledTest() {
        var student = Student("TOM", 12)
        System.out.print("name--" + student.name + "  age--" + student.age)
        student.age = 13
    }

    /**
     * 自定义构造器
     */
    @Test
    fun CoustomConstructorTest() {
        var compare = Compare(13, 12)
        System.out.print(compare.isfalg)
    }

    /**
     * when  处理枚举类
     */

    @Test
    fun whenTest() {

        System.out.print(getColor(EnumColor.BLUE))

        System.out.print("\n\r" + mix(EnumColor.YELLOW, EnumColor.RED))
        System.out.print("\n\r" + noParam(EnumColor.YELLOW, EnumColor.RED))
    }

    /**
     * 枚举和合并
     */
    fun getColor(enumColor: EnumColor): String {
        var color: String = ""
        when (enumColor) {
            EnumColor.RED -> color = "red"
            EnumColor.GREEN -> color = "green"
            EnumColor.BLUE -> color = "blue"
            EnumColor.YELLOW, EnumColor.OTHERS -> "merge"
        }
        return color
    }

    /**
     * 任意对象
     */
    fun mix(enumColor1: EnumColor, enumColor2: EnumColor): String {
        var color: String
        when (setOf(enumColor1, enumColor2)) {

            setOf(EnumColor.RED, EnumColor.YELLOW) -> color = "1"
            setOf(EnumColor.OTHERS, EnumColor.YELLOW) -> color = "2"
            else -> color = "3"
        }
        return color
    }

    /**
     * 不带任意参数
     */
    fun noParam(enumColor1: EnumColor, enumColor2: EnumColor): String {
        var color: String
        when {
            (enumColor1 == EnumColor.RED) || (enumColor2 == EnumColor.GREEN) -> color = "1"
            (enumColor1 == EnumColor.RED || enumColor2 == EnumColor.OTHERS) || (enumColor2 == EnumColor.GREEN) -> color = "2"
            else -> color = "other"

        }
        return color

    }
}
