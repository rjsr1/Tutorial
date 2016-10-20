package tutorial

class HelloWorldController {

    def index() {

    Pessoa person= new Pessoa(nome :'Rodolfo',sobrenome: 'Rocha',idade: 26)
    [person:person]
    }
}
