import console_shapes.shapes.*
import console_shapes_dsl.external.*

fun main() {
    panel {
        repeat(5) {
            composed {
                val rhombus = rhombus {
                    lines = it + 1
                    char = 'z' - it
                }
                val triangle = triangle {
                    lines = it + 1
                }
                val square = square {
                    lines = it + 1
                    char = 'a' + it
                }

                rhombus union triangle intersection square
            }
            space()
        }
    }.print()
}
