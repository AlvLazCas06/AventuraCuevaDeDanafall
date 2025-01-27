package principal;

import controller.ControllerArmas;
import controller.ControllerAyudas;
import controller.ControllerBichos;
import controller.ControllerJugador;
import controller.ControllerMapa;
import crud.CrudJugador;
import crud.CrudBichos;
import crud.CrudAyudas;
import datos.DatosAyudas;
import datos.DatosBichos;
import datos.DatosJugador;
import datos.DatosMapa;
import utilidades.Aleatorio;
import utilidades.Leer;
import vista.ImprimirArmas;
import vista.ImprimirBichos;
import vista.ImprimirMapa;
import vista.ImprimirPeleas;
import vista.ImprimirGeneral;
import vista.ImprimirJugador;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Cristina ha comprobado la ortografía.
		// Álvaro ha hecho los dibujos manualmente.

		Aleatorio a = new Aleatorio();
		ImprimirMapa imMapa = new ImprimirMapa();
		ImprimirArmas imArm = new ImprimirArmas();
		ImprimirPeleas imPer = new ImprimirPeleas();
		ImprimirBichos imBichos = new ImprimirBichos();
		ImprimirJugador imJug = new ImprimirJugador();
		ImprimirGeneral imGen = new ImprimirGeneral();
		ControllerMapa conMapa = new ControllerMapa();
		ControllerJugador conJug = new ControllerJugador();
		ControllerBichos conBichos = new ControllerBichos();
		ControllerAyudas conAyu = new ControllerAyudas();
		ControllerArmas conArmas = new ControllerArmas();
		CrudJugador crudJ;
		CrudBichos crudB;
		CrudAyudas crudA;
		DatosMapa datMapa;
		DatosJugador datJug;
		DatosBichos datBichos;
		DatosAyudas datAyu;

		int opcionInicio, opcionBicho, opcionBatalla = 0, opcionCaraOCruz, resCaraOCruz = 0, danoAEnemigo = 0,
				danoAJug = 0, opcionAyuda, dificultad, vidaDada, vidaSumada, nuevaDefensa;
		int dos = 2, uno = 1, vidaTemp = 120, vidaBase = 120, vidaMax = 150, vidaIncre = 30, arma;
		String mover, loQueSea, respuestaUsuario;
		boolean atacar = false, pocion = false, batalla, vivo;

		// Tarea de: Cristina
		// Realizado por: Cristina

		// INICIO
		do {
			imGen.imprimirInicio();
			opcionInicio = Leer.datoInt();

			switch (opcionInicio) {
			case 0:
				System.out.println("¡Hasta luego!");
				break;
			case 1:
				// Inicializamos todo
				datAyu = new DatosAyudas();
				datBichos = new DatosBichos();
				datJug = new DatosJugador();
				datMapa = new DatosMapa();
				crudJ = new CrudJugador(datJug);
				crudB = new CrudBichos(datBichos);
				crudA = new CrudAyudas(datAyu);

				imJug.imprimirJugador();
				imGen.imprimirIntro(datJug.getJ().getNombre());
				do {
					// Código del mapa y movimientos
					conMapa.pintarBichoMuertoMapa(datMapa, datBichos);
					conMapa.desbloquearMapa(datMapa, datBichos);
					imMapa.imprimirMapa1(datMapa);
					mover = Leer.dato();
					conMapa.cambiarPosMapa1(mover, datMapa, datJug);
					// Cambiamos al segundo mapa
					if (conMapa.cambiarDeMapa(mover, datMapa, datJug) == dos) {
						while(conMapa.cambiarDeMapa(mover, datMapa, datJug) == 2
								|| conMapa.cambiarDeMapa(mover, datMapa, datJug) == 0 && datJug.getJ().getVida() != 0) {
							conMapa.pintarBichoMuertoMapa(datMapa, datBichos);
							imMapa.imprimirMapa2(datMapa);
							mover = Leer.dato();
							conMapa.cambiarPosMapa2(mover, datMapa, datJug);
							opcionBicho = conJug.accederPelea(mover, datMapa, datJug);
							if (opcionBicho != 0) {
								batalla = true;
								// Tarea de: Álvaro
								// Realizado por: Álvaro
								crudB.actualizarBatalla(opcionBicho, batalla);
								imBichos.imprimirBichoFinalAntes();
								System.out.println("¿Quien anda ahí?,\n" + "¿sois vosotros?");
								System.out.println("No, tu no eres uno de mis secuaces...\n"
										+ " ¡Tú eres la brujita de la aldea salesiana!");
								loQueSea = Leer.dato();
								imBichos.imprimirBichoFinalAntes();
								System.out.println("¿¡¿Cómo has podido acabar con mis secuaces?!?");
								loQueSea = Leer.dato();
								imJug.imprimirJugador();
								System.out.println("Tus secuaces no me lo han puesto nada fácil\n"
										+ "pero he podido acabar con ellos...");
								loQueSea = Leer.dato();
								imJug.imprimirJugador();
								System.out.println("¡Acabaré contigo y dejaréis a la aldea en paz!");
								loQueSea = Leer.dato();
								imBichos.imprimirBichoFinalAntes();
								System.out.println("¡Eso no lo voy a permitir!\n"
										+ "Para conseguirlo, tienes que ganarme en mi juego favorito...");
								do {
									// Tarea de: Cristina
									// Realizado por: Cristina
									imGen.imprimirMenuCaraOCruz();
									opcionCaraOCruz = Leer.datoInt();
									if (opcionCaraOCruz == 1 || opcionCaraOCruz == 2) {
										resCaraOCruz = a.generarAleatorio(dos, uno);
										if (resCaraOCruz == opcionCaraOCruz) {
											// Tarea de: Álvaro
											// Realizado por: Álvaro
											imBichos.imprimirBichoFinalAntes();
											System.out.println(
													"¡Maldición!; aunque me ganes, no acabarás conmigo tan fácilmente..");
											imJug.imprimirJugador();
											System.out.println("Parece que no eras tan fuerte como aparentabas...");
											System.out.println("Espera un momento, ¿¿qué te esta pasando??");
											loQueSea = Leer.dato();
											imBichos.imprimirBichoFinalAntes();
											System.out.println("¡¿Creíste que me ibas a vencer tan fácilmente?!\n"
													+ "¡¡No te creas la gran cosa, niñata!!");
											loQueSea = Leer.dato();
											imBichos.imprimirBichoFinalMedio();
											System.out.println("¡¡¡¡¡aaaaaaaawwwrrrggghhhhhhh!!!!!");
											loQueSea = Leer.dato();
											imJug.imprimirJugador();
											System.out.println("La cosa se pone chunga...\n"
													+ "Y yo que pensaba que esto iba a ser rápido...");
											loQueSea = Leer.dato();
											imBichos.imprimirBichoFinalDespues();
											System.out.println("Ahora vas a ver el auténtico poder de "
													+ datBichos.getLista1()[opcionBicho - uno] + " prepárate,\n"
													+ "¡porque vas a morir en el intento!");

											System.out.println("¡Toma esa!");
											loQueSea = Leer.dato();
											danoAJug = conBichos.atacarBicho(datBichos.getLista1()[opcionBicho - uno],
													datJug.getJ().getVida(), datJug);
										} else {
											imJug.imprimirJugador();
											System.out.println("No dejaré que te salgas con la tuya...\n"
													+ "Solo eres una taza que sigue repitiendo los mismos errores, \n"
													+ "siempre lleno de código redundante y sin nada de flexibilidad...\n"
													+ "¡Por no hablar de tus sobrecargas de métodos!");
											System.out.println("Espera un momento, ¿¿qué te esta pasando??");
											loQueSea = Leer.dato();
											imBichos.imprimirBichoFinalMedio();
											System.out.println("¡¡¡¡¡aaaaaaaawwwrrrggghhhhhhh!!!!!");
											loQueSea = Leer.dato();
											imBichos.imprimirBichoFinalDespues();
											System.out.println("¡Me has hartado!, ahora vas a ver mi poder real...");
											loQueSea = Leer.dato();
										}
									} else {
										System.out.println("No has introducido una opción válida.");
									}
								} while (opcionCaraOCruz != 1 && opcionCaraOCruz != 2);

								// Tarea de: Cristina
								// Realizado por: Cristina
								do {
									imPer.imprimirPeleaFinal();

									if (resCaraOCruz != opcionCaraOCruz) {
										conBichos.verDanoBicho(datJug.getJ().getVida(), danoAJug);
										crudJ.actualizarVida(danoAJug);

										opcionCaraOCruz = resCaraOCruz;
									}
									imGen.imprimirStats(datBichos.getLista1()[opcionBicho - uno], datJug.getJ());

									if (datJug.getJ().getVida() != 0
											&& datBichos.getLista1()[opcionBicho - uno].getHealth() != 0) {

										System.out.println("Es tu turno de atacar:");
										imArm.imprimirMenuLucha(datJug.getJ().getArmas());
										opcionBatalla = Leer.datoInt();

										switch (opcionBatalla) {
										case 0:
											System.out.println("Parece que deseas huir... Puedes aprovechar esta "
													+ "oportunidad para obtener vida o alguna poción...");
											break;
										case 1:
											atacar = true;
											break;
										case 2:
											pocion = true;
											break;
										case 3:
											pocion = true;
											break;
										case 4:
											pocion = true;
											break;
										default:
											System.out.println("No has introducido una opcion válida.");
										}
									}
									if (pocion) {
										if (datJug.getJ().getArmas()[opcionBatalla - uno].isStatus()
												&& opcionBatalla != 4) {
											atacar = true;
										} else if (datJug.getJ().getArmas()[3].isStatus()) {
											datBichos.getLista1()[opcionBicho - uno].getDefense();
											nuevaDefensa = conArmas.calcularNuevaDefensa(
													datBichos.getLista1()[opcionBicho - uno].getDefense(),
													datJug.getJ().getArmas()[3].getMaxDamage());

											crudB.actualizarDefensa(opcionBicho, nuevaDefensa);
											datBichos.getLista1()[opcionBicho - uno].getDefense();
											crudJ.desactivarEstadoPocion();
										}
										pocion = false;
									}

									if (atacar) {
										danoAEnemigo = conJug.atacarJugador(datBichos.getLista1()[opcionBicho - uno],
												opcionBatalla);
										conJug.verDanoJug(datBichos.getLista1()[opcionBicho - uno].getHealth(),
												danoAEnemigo);
										crudB.actualizarVida(opcionBicho, danoAEnemigo);

										// Aquí ataca el enemigo si le queda vida
										if (danoAEnemigo != 0) {
											danoAJug = conBichos.atacarBicho(datBichos.getLista1()[opcionBicho - uno],
													datJug.getJ().getVida(), datJug);
											conBichos.verDanoBicho(datJug.getJ().getVida(), danoAJug);
											crudJ.actualizarVida(danoAJug);
											System.out.println("Pulse cualquier letra para continuar.");
											loQueSea = Leer.dato();

										}
										atacar = false;
									}
									if (datJug.getJ().getVida() == 0) {
										System.out.println("¡El enemigo final a acabado contigo!\n"
												+ "Prepara una mejor estrategia la próxima vez.\n"
												+ "Cuando salgas vuelve a pulsar otra tecla para volver al inicio."
												+ "Pulsa cualquier tecla para continuar.");
										loQueSea = Leer.dato();
									}
									// Mensaje si ha muerto el jugador
									else if (datBichos.getLista1()[opcionBicho - uno].getHealth() == 0) {
										imBichos.imprimirMuerto();
										System.out.println("¡Enhorabuena, has acabado con el enemigo!");
										System.out.println("Pulsa cualquier letra para continuar.");
										System.out.println();
										loQueSea = Leer.dato();
										imJug.imprimirJugador();
										System.out
												.println("¡¡Esta cámara se esta derrumbando, tengo que huir de aquí!!");
										loQueSea = Leer.dato();
										vivo = false;
										crudB.actualizarVivo(opcionBicho, vivo);
										opcionBatalla = 0;
										batalla = false;
										crudB.actualizarBatalla(opcionBicho, batalla);
									}

									if (opcionBatalla == 0 || datJug.getJ().getVida() == 0
											|| datBichos.getLista1()[opcionBicho - uno].getHealth() == 0) {
										batalla = false;
										crudB.actualizarBatalla(opcionBicho, batalla);
									}

								} while (datBichos.getLista1()[opcionBicho - uno].isEnLucha()
										&& datJug.getJ().getVida() != 0
										&& datBichos.getLista1()[opcionBicho - uno].getHealth() != 0);

							}

						}

					}
					// Tarea de: Cristina
					// Realizado por: Cristina
					opcionBicho = conJug.accederPelea(mover, datMapa, datJug);
					opcionAyuda = conJug.accederAyudas(mover, datMapa, datJug, opcionInicio);
					// Tarea de: Adrián
					// Realizado por: Adrián
					// ENTRAR EN AYUDAS
					if (opcionAyuda != 0) {
						System.out.println(conJug.accederAyudas(mover, datMapa, datJug, opcionInicio));
						imGen.imprimirDificultadesPreguntas();
						dificultad = Leer.datoInt();
						// Tarea de: Cristina y Álvaro
						// Realizado por: Cristina y álvaro
						switch (dificultad) {
						// Entrar a ayuda de vida
						case 1:
							// Tarea de: Adrián
							// Realizado por: Adrián
							if (!datAyu.getListaVida()[dificultad - uno].isAcertada()) {
								System.out.println(datAyu.getListaVida()[dificultad - uno].getContenido());
								respuestaUsuario = Leer.dato();

								if (conAyu.comprobarRespuesta(respuestaUsuario,
										datAyu.getListaVida()[dificultad - uno].getResultado(), dificultad)) {
									vidaDada = conAyu.sumarVida(dificultad);
									System.out.println("¡Felicidades! Has acertado la pregunta, según la dificultad "
											+ "que has elegido, \nse te han sumado " + vidaDada
											+ " puntos de vida a tu salud.");
									vidaSumada = vidaDada + datJug.getJ().getVida();
									crudJ.actualizarVida(vidaSumada);
									crudA.acertarPreguntaVida(dificultad);
									System.out.println("Pulsa cualquier tecla para continuar.");
									loQueSea = Leer.dato();
								} else {
									System.out
											.println("Qué mal, no has acertado...\n" + "Quizás deberías estudiar más.");
									System.out.println("Pulsa cualquier tecla para continuar.");
									loQueSea = Leer.dato();
								}
							} else {
								System.out
										.println("Esta pregunta ya ha sido acertada, no puedes volver a contestarla.");
							}
							break;
						// Entrar a ayuda de defensa
						case 2:
							// Tarea de: Adrián
							// Realizado por: Adrián
							if (!datAyu.getListaDefensa()[dificultad - uno].isAcertada()) {
								System.out.println(datAyu.getListaDefensa()[dificultad - uno].getContenido());
								respuestaUsuario = Leer.dato();

								if (conAyu.comprobarRespuesta(respuestaUsuario,
										datAyu.getListaDefensa()[dificultad - uno].getResultado(), dificultad)) {
									crudJ.activarEstadoPocion();
									crudJ.establecerPoderPocion(conAyu, dificultad);
									System.out.println(
											"¡Felicidades! Has acertado la pregunta, según la dificultad que has elegido, \n has "
													+ "optenido una poción que quita "
													+ datJug.getJ().getArmas()[3].getMaxDamage() + " puntos "
													+ "de defensa al enemigo");
									crudA.acertarPreguntaDefensa(dificultad);
								} else {
									System.out.println("Vaya... has fallado.\n"
											+ "A lo mejor sería necesario que dejaras las maquinitas y estudiases un poco más...");
									System.out.println("Pulsa cualquier tecla para continuar.");
									loQueSea = Leer.dato();
								}
							} else {
								System.out
										.println("Esta pregunta ya ha sido acertada, no puedes volver a contestarla.");
							}
							break;
						// Tarea de: Cristina
						// Realizado por: Cristina
						default:
							System.out.println("No has introducido una opción válida.");

						}

					}
					// ENTRAR EN PELEA
					// Tarea de: Cristina
					// Realizado por: Cristina
					if (opcionBicho != 0) {
						batalla = true;
						crudB.actualizarBatalla(opcionBicho, batalla);
						if (opcionBicho == uno) {
							// Bicho 1
							imBichos.imprimirBicho1();
							System.out.println("¡Te has encontrado un enemigo!");
							// Tarea de: Álvaro
							// Realizado por: Álvaro
							System.out.println("¿Quien anda ahí?\n" + "¡Eres la brujita de la aldea salesiana! "
									+ "\nSoy " + datBichos.getLista1()[opcionBicho - uno].getName() + " y estamos "
									+ "planeando destruir vuestra aldea,\n"
									+ "así que preparate a morir, ¡no vamos a permitir\n"
									+ "que nuestros planes se vayan al traste!");
							loQueSea = Leer.dato();
							imJug.imprimirJugador();
							System.out.println("Vuestros planes fracasarán...\n"
									+ "No voy a permitir que la aldea quede destruida...");
							System.out.println("Pulse cualquier letra para continuar");
							loQueSea = Leer.dato();
							imBichos.imprimirBicho1();
						} else {
							// Bicho 2
							imBichos.imprimirBicho2();
							System.out.println("¡Te has encontrado un enemigo!");
							System.out.println("¿Quien anda ahí?\n" + "¡Eres la brujita de la aldea salesiana!,\n"
									+ "Soy " + datBichos.getLista1()[opcionBicho - uno].getName()
									+ " y siento en tí un gran poder pero, con tu poder actual,\n"
									+ " no vas a vencerme tan fácilmente.\n" + "¡Vamos allá, niña!");
							System.out.println("Pulse cualquier letra para continuar");
							loQueSea = Leer.dato();
							imJug.imprimirJugador();
							System.out.println("Luces muy poderoso,\n" + "pero voy a acabar contigo.\n"
									+ "¡Te mostraré por qué no debes subestimarme!");
							System.out.println("Pulse cualquier letra para continuar");
							loQueSea = Leer.dato();
							imBichos.imprimirBicho2();
						}
						// Tarea de: Cristina
						// Realizado por: Cristina
						// Cara o cruz
						System.out.println("Para ver quién ataca primero, es necesario jugar a un jueguito...");
						do {
							imGen.imprimirMenuCaraOCruz();
							opcionCaraOCruz = Leer.datoInt();
							if (opcionCaraOCruz == 1 || opcionCaraOCruz == 2) {
								resCaraOCruz = a.generarAleatorio(dos, uno);
								if (resCaraOCruz == opcionCaraOCruz) {
									System.out.println("¡Has ganado!, parece que la suerte está de tu parte...");
									System.out.println("Pulse cualquier letra para continuar");
									loQueSea = Leer.dato();
									if (opcionBicho == uno) {
										imPer.imprimirPrimeraPelea();
									} else if (opcionBicho == dos) {
										imPer.imprimirSegundaPelea();
									}
									imGen.imprimirStats(datBichos.getLista1()[opcionBicho - uno], datJug.getJ());
								} else {
									System.out.println("Has fallado... a ver si en la pelea tienes más suerte...");
									loQueSea = Leer.dato();
									danoAJug = conBichos.atacarBicho(datBichos.getLista1()[opcionBicho - uno],
											datJug.getJ().getVida(), datJug);

								}
							} else {
								System.out.println("No has introducido una opción válida.");
							}

						} while (opcionCaraOCruz != 1 && opcionCaraOCruz != 2);
						// Tarea de: Cristina y Adrián
						// Realizado por: Cristina y Adrián
						// Entrar en combate
						do {

							if (opcionBicho == 1) {
								imPer.imprimirPrimeraPelea();
							} else if (opcionBicho == 2) {
								imPer.imprimirSegundaPelea();
							} else {
								imPer.imprimirPeleaFinal();
							}

							if (resCaraOCruz != opcionCaraOCruz) {
								conBichos.verDanoBicho(datJug.getJ().getVida(), danoAJug);
								crudJ.actualizarVida(danoAJug);
								opcionCaraOCruz = resCaraOCruz;
							}
							imGen.imprimirStats(datBichos.getLista1()[opcionBicho - uno], datJug.getJ());

							if (datJug.getJ().getVida() != 0
									&& datBichos.getLista1()[opcionBicho - uno].getHealth() != 0) {

								System.out.println("Es tu turno de atacar:");
								imArm.imprimirMenuLucha(datJug.getJ().getArmas());
								opcionBatalla = Leer.datoInt();

								switch (opcionBatalla) {
								case 0:
									System.out.println("Parece que deseas huir... Puedes aprovechar esta "
											+ "oportunidad para obtener vida o alguna poción...");
									break;
								case 1:
									atacar = true;
									break;
								case 2:
									pocion = true;
									break;
								case 3:
									pocion = true;
									break;
								default:
									System.out.println("No has introducido una opcion válida.");
									System.out.println("Pulse cualquier letra para continuar");
									loQueSea = Leer.dato();
								}
							}
							if (pocion) {
								if (datJug.getJ().getArmas()[opcionBatalla - uno].isStatus() && opcionBatalla != 4) {
									atacar = true;
								} else if (datJug.getJ().getArmas()[3].isStatus()) {
									datBichos.getLista1()[opcionBicho - uno].getDefense();
									nuevaDefensa = conArmas.calcularNuevaDefensa(
											datBichos.getLista1()[opcionBicho - uno].getDefense(),
											datJug.getJ().getArmas()[3].getMaxDamage());
									crudB.actualizarDefensa(opcionBicho, nuevaDefensa);
									datBichos.getLista1()[opcionBicho - 1].getDefense();
									crudJ.desactivarEstadoPocion();
								}
								pocion = false;
							}

							if (atacar) {
								danoAEnemigo = conJug.atacarJugador(datBichos.getLista1()[opcionBicho - uno],
										opcionBatalla);
								conJug.verDanoJug(datBichos.getLista1()[opcionBicho - uno].getHealth(), danoAEnemigo);
								crudB.actualizarVida(opcionBicho, danoAEnemigo);

								// Aquí ataca el enemigo si le queda vida
								if (danoAEnemigo != 0) {
									danoAJug = conBichos.atacarBicho(datBichos.getLista1()[opcionBicho - uno],
											datJug.getJ().getVida(), datJug);
									conBichos.verDanoBicho(datJug.getJ().getVida(), danoAJug);
									crudJ.actualizarVida(danoAJug);
									System.out.println("Pulse cualquier letra para continuar");
									loQueSea = Leer.dato();

								}
								atacar = false;
							}

							// Tarea de: Cristina
							// Realizado por: Cristina
							// Mensaje si ha muerto el jugador
							if (datJug.getJ().getVida() == 0) {
								System.out.println(
										"¡Que mala suerte, el enemigo te ha quitado todos los puntos de vida que te quedaban!\n"
												+ "Parece que ya no puedes continuar jugando en esta partida...\n"
												+ "Pulsa cualquier letra para continuar.");
								loQueSea = Leer.dato();
							} else if (datBichos.getLista1()[opcionBicho - uno].getHealth() == 0) {
								imBichos.imprimirMuerto();
								System.out.println("¡Enhorabuena, has acabado con el enemigo!");
								System.out.println("Pulsa cualquier letra para continuar.");
								loQueSea = Leer.dato();
								if (vidaTemp <= vidaMax) {
									System.out.println("Tu salud se ha regenerado."
											+ " \nAhora parece que tienes incluso más puntos de vida que cuando entraste a la cueva...");
									System.out.println("Pulsa cualquier letra para continuar.");
									loQueSea = Leer.dato();
									System.out.println("¡Has desbloqueado un arma!");
									if (vidaTemp == vidaBase) {
										imArm.imprimirEspada();
										arma = 1;
										crudJ.activarEstadoArma(arma);

									} else if (vidaTemp == vidaMax) {
										imArm.imprimirArco();
										arma = 2;
										crudJ.activarEstadoArma(arma);
									}
									System.out.println("Pulsa cualquier letra para continuar.");
									loQueSea = Leer.dato();
									opcionBatalla = 0;
									vivo = false;
									crudB.actualizarVivo(opcionBicho, vivo);
									vidaTemp += vidaIncre;
									crudJ.actualizarVida(vidaTemp);
									batalla = false;
									crudB.actualizarBatalla(opcionBicho, batalla);
								}
							}

							if (opcionBatalla == 0 || datJug.getJ().getVida() == 0
									|| datBichos.getLista1()[opcionBicho - uno].getHealth() == 0) {
								batalla = false;
								crudB.actualizarBatalla(opcionBicho, batalla);
							}

						} while (datBichos.getLista1()[opcionBicho - 1].isEnLucha() && datJug.getJ().getVida() != 0
								&& datBichos.getLista1()[opcionBicho - uno].getHealth() != 0);

					}
					// Tarea de: Álvaro
					// Realizado por: Álvaro
					if (!datBichos.getB3().isStatus()) {
						imGen.imprimirFinalDelJuego();
						System.out.println("Pulsa cualquier tecla para continuar.");
						loQueSea = Leer.dato();
						imGen.imprimirFinalDelJuego2();
						System.out.println("Pulsa cualquier tecla para continuar.");
						loQueSea = Leer.dato();
					}
				} while (datJug.getJ().getVida() != 0 && datBichos.getLista1()[2].isStatus());
				break;

			case 2:
				// Tarea de: Álvaro
				// Realizado por: Álvaro
				imGen.imprimirManual();
				System.out.println("Pulsa cualquier tecla para continuar.");
				loQueSea = Leer.dato();
				break;

			default:
				System.out.println("No has escogido una opción válida.");
			}
		} while (opcionInicio != 0);

	}

}
