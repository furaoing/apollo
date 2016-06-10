/**
 * Created by rao on 16-3-19.
 */
package test2

case class AdjacentVertex(_id:Int, _edge_len:Int) {
    val id = _id
    val edge_len = _edge_len
  }

case class Vertex(_id:Int, _distance:Option[Int]) {
  val id = _id
  var adjacentVertex:List[AdjacentVertex] = List()
  var distance:Option[Int] = _distance

  def push(_v:AdjacentVertex) = {
    adjacentVertex = adjacentVertex :+ _v
  }
}

case class Graph() {
  var vertice:List[Vertex] = List(Vertex(0, Some(0)))
  // Placeholder, starting point, vertex 0

  var vertex_set:Set[Vertex] = Set()
  var spt_set:Set[Vertex] = Set()

  def push(_v:Vertex) = {
    vertice = vertice :+ _v
    vertex_set += _v
  }

  def pick_vertex():Vertex = {
    var tmp_vertex = vertex_set.head
    for (x <- vertex_set) {
        if( x.distance.getOrElse(99) < tmp_vertex.distance.getOrElse(99)){
          tmp_vertex = x
      }
    }
    tmp_vertex
  }
}

object Viterbi extends App {

   val g = Graph()
   for (i <- Range(1,6)){
       g.push(Vertex(i, None))
   }

  g.vertice.head.push(AdjacentVertex(1, 9))
  g.vertice.head.push(AdjacentVertex(2, 7))
  g.vertice(1).push(AdjacentVertex(3, 7))
  g.vertice(1).push(AdjacentVertex(4, 9))
  g.vertice(1).push(AdjacentVertex(0, 9))
  g.vertice(2).push(AdjacentVertex(0, 7))
  g.vertice(2).push(AdjacentVertex(3, 7))
  g.vertice(2).push(AdjacentVertex(4, 10))
  g.vertice(3).push(AdjacentVertex(5, 9))
  g.vertice(3).push(AdjacentVertex(1, 7))
  g.vertice(3).push(AdjacentVertex(2, 7))
  g.vertice(4).push(AdjacentVertex(5, 15))
  g.vertice(4).push(AdjacentVertex(1, 9))
  g.vertice(4).push(AdjacentVertex(2, 10))

  g.vertice(5).push(AdjacentVertex(3, 9))
  g.vertice(5).push(AdjacentVertex(4, 15))

  def shortest_path(v:Vertex, g:Graph):Int = {
        if (v.id == 0){
          v.distance.getOrElse(0)
        }
        else {
          val tmp:List[Int] = List()
          for (av <- v.adjacentVertex){
            if (av.id < v.id) {
              val tmp1 = shortest_path(g.vertice(av.id), g) + av.edge_len
              tmp :+ tmp1
            }
          }
          // g.vertice(av.id).shortest_path
        tmp.min
        }
  }

    def helper(g:Graph) = {
      val v = g.vertice(5)
      val shortest = shortest_path(v, g)
      println(shortest)
    }

  helper(g)

  for(v <- g.vertice){
    println("ID: " + v.id + ";Distance: " + v.distance.getOrElse(0))
  }
}
