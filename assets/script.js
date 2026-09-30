const menuBtn = document.getElementById("menuBtn");
const navLinks = document.getElementById("navLinks");


// MOBILE MENU

menuBtn.addEventListener("click", () => {
  navLinks.classList.toggle("open");
});


// CLOSE MENU AFTER CLICKING A LINK

document.querySelectorAll("#navLinks a").forEach((link) => {

  link.addEventListener("click", () => {
    navLinks.classList.remove("open");
  });

});


// CHANGE PAGE TITLE WHILE SCROLLING

const sections = document.querySelectorAll("main section[id]");

window.addEventListener("scroll", () => {

  let current = "home";

  sections.forEach((section) => {

    if (window.scrollY >= section.offsetTop - 180) {
      current = section.id;
    }

  });

  document.title =
    current === "home"
      ? "Vabss Portfolio | Vaibhaavi Bhanuse"
      : `${current.charAt(0).toUpperCase() + current.slice(1)}
         | Vabss Portfolio`;

});